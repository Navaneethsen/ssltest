/**
 * 
 */
package eu.boortz.ssltest.lib.tester.settings.sslprotocol;

import eu.boortz.ssltest.httpclient.clients.settings.DefaultSettings;

/**
 * @author benni
 *
 */
public class DefaultSSLProtocols implements ISSLProtocolsSettings {

	@Override
	public String[] getSSLProtocols() {
		return DefaultSettings.SSL_PROTOCOLS;
	}

}
