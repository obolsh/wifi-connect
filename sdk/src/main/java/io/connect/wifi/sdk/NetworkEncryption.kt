package io.connect.wifi.sdk

/**
 * Types of encryption for wifi point
 *
 * @since 1.0.1
 */
sealed class NetworkEncryption {
    /**
     * @suppress Not Recommended option.
     * Can use {@link android.net.wifi.WifiConfiguration.AuthAlgorithm.SHARED} authentication
     * protocols for wifi communications
     *
     * @see android.net.wifi.WifiConfiguration.AuthAlgorithm.SHARED
     */
    object WEP : NetworkEncryption()

    /**
     * Can use {@link android.net.wifi.WifiConfiguration.AuthAlgorithm.OPEN} authentication
     * protocols for wifi communications.
     * It supports {@link android.net.wifi.WifiConfiguration.Protocol.WPA} and
     * {@link android.net.wifi.WifiConfiguration.Protocol.RSN} protocols
     *
     * @see android.net.wifi.WifiConfiguration.AuthAlgorithm.OPEN
     * @see android.net.wifi.WifiConfiguration.Protocol.WPA
     * @see android.net.wifi.WifiConfiguration.Protocol.RSN
     */
    object WPA2 : NetworkEncryption()

    /**
     * Can use {@link android.net.wifi.WifiConfiguration.AuthAlgorithm.OPEN} authentication
     * protocols for wifi communications.
     * It supports {@link android.net.wifi.WifiConfiguration.Protocol.RSN} protocol.
     * It uses {@link android.net.wifi.WifiEnterpriseConfig}
     *
     * @see android.net.wifi.WifiConfiguration.AuthAlgorithm.OPEN
     * @see android.net.wifi.WifiConfiguration.Protocol.RSN
     * @see android.net.wifi.WifiEnterpriseConfig
     */
    object WPA2EAP : NetworkEncryption()

    /**
     * @suppress Unused option
     */
    object NO_PASSWORD : NetworkEncryption()
}