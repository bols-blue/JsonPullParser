package net.vvakame.util.jsonpullparser.factory.template;

import java.io.IOException;

import javax.tools.JavaFileObject;

import net.vvakame.util.jsonpullparser.factory.GeneratingModel;

public class Template {

	private Template() {
	}

	public static void write(JavaFileObject fileObject, GeneratingModel model)
			throws IOException {
		boolean flg = true;
		if (flg) {
			MvelTemplate.write(fileObject, model);
		} else {
			// TODO not work correctly.
			VelocityTemplate.write(fileObject, model);
		}
	}
}