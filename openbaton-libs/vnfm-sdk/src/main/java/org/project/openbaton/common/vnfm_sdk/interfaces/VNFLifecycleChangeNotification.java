package org.project.openbaton.common.vnfm_sdk.interfaces;

import org.project.openbaton.catalogue.nfvo.messages.Interfaces.NFVMessage;
import org.project.openbaton.common.vnfm_sdk.exception.VnfmSdkException;

/**
 * Created by mpa on 05/05/15.
 */

public interface VNFLifecycleChangeNotification {
	
	/**
	 * This operation allows providing notifications on state changes 
	 * of a VNF instance, related to the VNF Lifecycle.
	 */
	void notifyChange();

}
