package com.github.narcissujsk.model.network;

import java.util.List;

import com.github.narcissujsk.common.Buildable;
import com.github.narcissujsk.model.common.Resource;
import com.github.narcissujsk.model.network.SecurityGroupRule;
import com.github.narcissujsk.model.network.builder.NetSecurityGroupBuilder;

/**
 * The Interface SecurityGroup.
 *
 * @author Nathan Anderson
 */
public interface SecurityGroup extends Resource, Buildable<NetSecurityGroupBuilder>{
  
  /**
   * Gets the description.
   *
   * @return the description
   */
  String getDescription();
  
  /**
   * Gets the rules.
   *
   * @return the rules
   */
  List<? extends SecurityGroupRule> getRules();
  
}
