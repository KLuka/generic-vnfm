package org.project.openbaton.common.vnfm_sdk.exception;

/**
 * Created by moritz on 24.09.15.
 */
public class EmsException extends VnfmSdkException {

    public EmsException() {
        super();
    }

    public EmsException(String message) {
        super(message);
    }

    public EmsException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmsException(Throwable e) {
        super(e);
    }
}
