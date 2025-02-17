package io.mosip.esignet.api.util;

public enum Action {
    OIDC_CLIENT_CREATE,
    OIDC_CLIENT_UPDATE,
    GET_OAUTH_DETAILS,
    TRANSACTION_STARTED,
    SEND_OTP,
    AUTHENTICATE,
    GET_AUTH_CODE,
    GENERATE_TOKEN,
    GET_USERINFO,
    DO_KYC_AUTH,
    DO_KYC_EXCHANGE,
    GET_CERTIFICATE,
    UPLOAD_CERTIFICATE,
    LINK_CODE,
    LINK_TRANSACTION,
    LINK_STATUS,
    LINK_AUTHENTICATE,
    SAVE_CONSENT,
    LINK_SEND_OTP,
    LINK_AUTH_CODE
}
