package ilg.gnuarmeclipse.packs.ui;

import org.eclipse.swt.graphics.Image;

import ilg.gnuarmeclipse.packs.core.tree.Leaf;
import ilg.gnuarmeclipse.packs.core.tree.Node;

public class IconUtils {

	public static final String ICONS_PLUGIN_ID = "ilg.gnuarmeclipse.packs.ui";

	public static Image getBookIcon(Leaf node) {

		String url = node.getProperty(Node.URL_PROPERTY, "");
		if (url.length() > 0) {
			return Activator.imageDescriptorFromPlugin(ICONS_PLUGIN_ID,
					"icons/external_browser.png").createImage();
		}
		String path = node.getProperty(Node.FILE_PROPERTY, "").toLowerCase();

		if (path.endsWith(".pdf")) {
			return Activator.imageDescriptorFromPlugin(ICONS_PLUGIN_ID,
					"icons/pdficon_small.png").createImage();
		} else if (path.endsWith(".chm")) {
			return Activator.imageDescriptorFromPlugin(ICONS_PLUGIN_ID,
					"icons/chm.png").createImage();
		} else if (path.endsWith(".zip")) {
			return Activator.imageDescriptorFromPlugin(ICONS_PLUGIN_ID,
					"icons/jar_obj.png").createImage();
		} else {
			return Activator.imageDescriptorFromPlugin(ICONS_PLUGIN_ID,
					"icons/library_obj.png").createImage();
		}
	}
}