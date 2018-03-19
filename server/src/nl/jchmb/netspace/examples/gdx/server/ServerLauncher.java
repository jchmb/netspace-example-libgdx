package nl.jchmb.netspace.examples.gdx.server;

import com.badlogic.gdx.backends.headless.HeadlessApplication;
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration;

public class ServerLauncher {
	public static void main(final String[] args) {
		HeadlessApplicationConfiguration config = new HeadlessApplicationConfiguration();
		new HeadlessApplication(
			new NetSpaceGDXServerGame(),
			config
		);
	}
}
