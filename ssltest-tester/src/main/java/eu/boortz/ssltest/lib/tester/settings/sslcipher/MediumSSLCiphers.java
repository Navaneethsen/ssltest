/**
 * 
 */
package eu.boortz.ssltest.lib.tester.settings.sslcipher;

import eu.boortz.ssltest.httpclient.clients.settings.MediumSettings;


/**
 * @author benni
 *
 */
public class MediumSSLCiphers implements ISSLCiphersSettings {

	@Override
	public String[] getSSLCiphers() {
		return MediumSettings.SSL_CIPHERS;
	}

}
