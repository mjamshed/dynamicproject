package org.dynamic.project.dynamicproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/reversestring")
public class ReverseString {

	@Path("{str}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String convertFtoCfromInput(@PathParam("str") String str) {

		return reverse(str);

	}

	public static String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
}
