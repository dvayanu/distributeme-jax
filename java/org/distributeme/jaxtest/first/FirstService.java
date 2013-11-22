package org.distributeme.jaxtest.first;

import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.DistributeMe;
import org.distributeme.core.ServiceDescriptor;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 22.11.13 15:23
 */
@DistributeMe(protocols = ServiceDescriptor.Protocol.JAXRS)
public interface FirstService extends Service {
	void printHelloWorld() throws FirstServiceException;

	String getMessageBack(String message) throws FirstServiceException;

	Parameter callWithParameter(Parameter in) throws FirstServiceException;
}
