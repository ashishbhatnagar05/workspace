package twitterConfigurationBuilder;

import twitter4j.*;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ConfigBuilder {
	public TwitterFactory twitterFactory() throws Exception {

		// Your Twitter App's Consumer Key
		final String consumerKey = "zlWf2wKz1eHuAE1fRLTzkQacG";

		// Your Twitter App's Consumer Secret
		final String consumerSecret = "CMPiBeEgx7rRydINueQczqrKQHAd6o3Lss9Eyk3sAuSA1wmqa1";

		// Your Twitter Access Token
		final String accessToken = "2468039048-LNK5kHswGJad460zQrl2ZUngCOVTWHDV1poqBeU";

		// Your Twitter Access Token Secret
		final String accessTokenSecret = "GXiPDSwV2qhWGXYcntoAjyGF3jafNQr02Xjekoxb7kzsG";

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKey).setOAuthConsumerSecret(consumerSecret)
				.setOAuthAccessToken(accessToken).setOAuthAccessTokenSecret(accessTokenSecret);
		return new TwitterFactory(cb.build());

	}

}
