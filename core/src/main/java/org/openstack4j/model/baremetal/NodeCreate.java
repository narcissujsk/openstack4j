package org.openstack4j.model.baremetal;
import net.sf.json.JSONObject;
import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.baremetal.builder.NodeCreateBuilder;
import org.openstack4j.openstack.common.GenericLink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface NodeCreate extends ModelEntity, Buildable<NodeCreateBuilder> {


    public String getName();

    public String getDriver() ;

    public JSONObject getDriverInfo();

    public JSONObject getProperties();

    public String getNetworkInterface() ;

    public String getResourceClass();


}
