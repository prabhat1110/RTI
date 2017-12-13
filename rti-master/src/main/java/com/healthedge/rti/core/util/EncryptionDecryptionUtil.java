package com.healthedge.rti.core.util;

import com.healthedge.rti.core.model.AsymmetricAlgoParams;
import com.healthedge.rti.core.model.SymmetricAlgoParams;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.util.Base64;

public class EncryptionDecryptionUtil {

    private static String plainText = "{\"ProcessId\":\"b1b5e7ad-eefd-40dd-9072-6f587432cb73\",\"ProcessName\":\"Enrollment Request - Contact Information REAL\",\"Status\":\"ClosedOnTime\",\"FromUserId\":\"3b07d892-f8e7-4ae9-a05d-9e05996f681e\",\"FromUserName\":\"healthedge.member\",\"Fields\":{\"$type\":\"System.Collections.Generic.Dictionary`2[[System.String, mscorlib],[System.String, mscorlib]], mscorlib\",\"memberMobilePhone\":\"317-100-2000\",\"memberHomePhone\":\"608-526-2028\",\"memberWorkPhone\":\"317-300-4000\",\"memberOtherPhone\":\"317-500-6000\",\"memberEmailAddress\":\"sam.jones@email.com\",\"memberAddress1\":\"4401 Southern Circle\",\"memberAddress2\":\"\",\"memberCity\":\"Kirkland\",\"memberState\":\"TX\",\"memberZip\":\"17960\",\"memberMailingAddressSame\":\"Yes\",\"memberMailingAddress1\":\"\",\"memberMailingAddress2\":\"\",\"memberMailingCity\":\"\",\"memberMailingState\":\"\",\"memberMailingZip\":\"\",\"AuthorizationFirstName\":\"Sam\",\"AuthorizationLastName\":\"Jones\"}}";
    private static String key = "9793D810B7DF00B23FE9A69A17629B4705E643D4B36DAE6A848223613416160D";
    private static SymmetricAlgoParams algoParams = new SymmetricAlgoParams("AES","CBC","PKCS5Padding");

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048, new SecureRandom());
        KeyPair pair = generator.generateKeyPair();
        return pair;
    }

    public static String doSymmetricEncryption(final String plainText, final String secretKey, SymmetricAlgoParams algoParams)throws Exception{
        final byte[] decodeKey = DatatypeConverter.parseHexBinary(secretKey);
        SecretKeySpec key= new SecretKeySpec(decodeKey,algoParams.getAlgorithm());
        Cipher cipher = getCipherInstance(algoParams);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedTextBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        return DatatypeConverter.printBase64Binary(encryptedTextBytes);
    }

    public static String doAsymmetricEncryption(final String plainText, final String publicKey, AsymmetricAlgoParams algoParams){
        return null;
    }

    public static String doSymmetricDecryption(final String encryptedText, final String secretKey, SymmetricAlgoParams algoParams) throws Exception{
        final byte[] encryptedTextBytes = DatatypeConverter.parseBase64Binary(encryptedText);
        final byte[] decodeKey = DatatypeConverter.parseHexBinary(secretKey);
        final byte[] iv = DatatypeConverter.parseHexBinary("629E2E1500B6BA687A385D410D5B08E3");
        SecretKeySpec key= new SecretKeySpec(decodeKey,algoParams.getAlgorithm());
        final Cipher cipher = getCipherInstance(algoParams);
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv,0,cipher.getBlockSize()));
        byte[] decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
        return new String(decryptedTextBytes);
    }

    public static String doAsymmetricDecryption(final String plainText, final String privateKey, AsymmetricAlgoParams algoParams){
        return null;
    }

    public static String sign(String plainText, PrivateKey privateKey) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(privateKey);
        privateSignature.update(plainText.getBytes(Charsets.UTF_8));
        byte[] signature = privateSignature.sign();
        return Base64.getEncoder().encodeToString(signature);
    }

    public static boolean verifySignature(String plainText, String signature, PublicKey publicKey) throws Exception {
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(publicKey);
        publicSignature.update(plainText.getBytes(Charsets.UTF_8));
        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        return publicSignature.verify(signatureBytes);
    }

    private static Cipher getCipherInstance(SymmetricAlgoParams algoParams)throws NoSuchAlgorithmException, NoSuchPaddingException {
        if(StringUtils.isNotEmpty(algoParams.getAlgorithm())){
            if(algoParams.getMode() == null){algoParams.setMode("NONE");}
            if(algoParams.getPadding() == null){algoParams.setPadding("NoPadding");}
        }else{
            throw new NoSuchAlgorithmException();
        }
        return Cipher.getInstance(algoParams.getAlgorithm()+"/"+algoParams.getMode()+"/"+algoParams.getPadding());
    }


    public static void main(String[] args) {
        try {
            String ciphertext = doSymmetricEncryption(plainText, key, algoParams);
            System.out.println(ciphertext);
            String decryptText = doSymmetricDecryption(ciphertext, key, algoParams);
            System.out.println(decryptText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
