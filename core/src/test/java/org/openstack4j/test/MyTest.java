package org.openstack4j.test;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.openstack4j.core.transport.Config;
import org.openstack4j.model.baremetal.Node;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.compute.Action;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.compute.ServerCreate;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.model.sahara.Cluster;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import org.openstack4j.api.OSClient.OSClientV3;
import org.openstack4j.core.transport.Config;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.openstack.OSFactory;

public class MyTest {
    Logger logger = Logger.getLogger("RequestBuilder");
	@Test
	public void test() {
		OSClientV3 os = getOpenstackClient();
		//List<? extends Project> list = os.identity().projects().list();
       // List<? extends Server> list1 = os.compute().servers().list();
        List<? extends Node> list = os.baremetal().nodes().list(true);
		System.out.println("test");
        //System.out.println(list1.size());
        //System.out.println(list1.get(0).toString());
        System.out.println(list.size());
		System.out.println(list.get(0).toString());
        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i));
        }
		System.out.println("test");
	}
    @Test
    public void get() {
        OSClientV3 os = getOpenstackClient();
       // ServerCreate server = os.compute().servers().serverBuilder().flavor("").build();
        //os.compute().servers().boot(server);
        Node list = os.baremetal().nodes().get("test");
        logger.info(list);
    }
    @Test
    public void testPoweron() {
        OSClientV3 os = getOpenstackClient();
        //List<? extends Project> list = os.identity().projects().list();
        ActionResponse re = os.compute().servers().action("a4dad9c8-4772-4fd2-b1b1-10d92ec1eab4", Action.START);
        List<? extends Node> list = os.baremetal().nodes().list();
        System.out.println("test");

        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i));
        }
        System.out.println("test");
    }

	public OSClientV3 getOpenstackClient() {
		String domainname = "Default";
		String v3url = "https://10.110.28.35:5000/v3";
		String name = "cps_admin";
		String password = "rnxjAmD24yGUZiF";
		Config config = Config.newConfig().withSSLVerificationDisabled();
        config.withIronicApiVersion("1.37");
		Identifier domainIdentifier = Identifier.byName(domainname);
		OSClientV3 os = OSFactory.builderV3().endpoint(v3url).credentials(name, password, domainIdentifier)
				.withConfig(config).authenticate();
		return os;
	}
}
