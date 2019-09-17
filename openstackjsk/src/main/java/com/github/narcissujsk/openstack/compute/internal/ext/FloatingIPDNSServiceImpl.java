package com.github.narcissujsk.openstack.compute.internal.ext;

import com.github.narcissujsk.api.Apis;
import com.github.narcissujsk.api.compute.ext.FloatingIPDNSDomainService;
import com.github.narcissujsk.api.compute.ext.FloatingIPDNSEntryService;
import com.github.narcissujsk.api.compute.ext.FloatingIPDNSService;

/**
 * API Service that manages the 'os-floating-ip-dns' extension
 * 
 * @author Jeremy Unruh
 */
public class FloatingIPDNSServiceImpl implements FloatingIPDNSService {

    @Override
    public FloatingIPDNSDomainService domains() {
        return Apis.get(FloatingIPDNSDomainService.class);
    }

    @Override
    public FloatingIPDNSEntryService entries() {
        return Apis.get(FloatingIPDNSEntryService.class);
    }

}
