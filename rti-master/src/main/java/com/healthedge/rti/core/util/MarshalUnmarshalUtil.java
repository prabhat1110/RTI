package com.healthedge.rti.core.util;

import com.healthedge.connector.schema.basetypes.SmokingStatusType;
import com.healthedge.connector.schema.membershipsparse.MembershipType;
import com.healthedge.connector.schema.subscriptionsparse.SubscriptionType;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class MarshalUnmarshalUtil {

    public static String marshall(Object object) throws JAXBException {
        Class clazz=object.getClass();
        JAXBContext contextObj = JAXBContext.newInstance(clazz);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw=new StringWriter();
        marshallerObj.marshal(new JAXBElement<>( new QName("", clazz.getSimpleName()), clazz, null, object), sw);
        return sw.toString();
    }

    public static <T> T unmarshall(Class<T> clazz, String xml) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StreamSource streamSource = new StreamSource(new StringReader(xml));
        JAXBElement<T> je = unmarshaller.unmarshal(streamSource,
                clazz);
        return je.getValue();
    }

    public static void main(String[] args)throws Exception {

        SubscriptionType subscriptionType = new SubscriptionType();
        subscriptionType.setDivision("xyz");
        subscriptionType.setApplicationSignature(true);
        SubscriptionType.ApplicationInfo app = new SubscriptionType.ApplicationInfo();
        app.setApplicationId("abc");
        subscriptionType.setApplicationInfo(app);


        MembershipType member = new MembershipType();
        member.setSmokingStatus(SmokingStatusType.NON_SMOKER);
        member.setOutOfServiceArea(true);

        String xmlString  = MarshalUnmarshalUtil.marshall(member);
        System.out.println("Generated : "+xmlString);
    }
}
