package org.distributeme.jaxtest.first;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 22.11.13 15:32
 */
public class FirstServiceImpl implements FirstService{
	@Override
	public void printHelloWorld() throws FirstServiceException {
		System.out.println("HELLO WORLD!");
	}

	@Override
	public String getMessageBack(String message) throws FirstServiceException {
		return "You said: "+message;
	}

	@Override
	public Parameter callWithParameter(Parameter in) throws FirstServiceException {
		Parameter n = new Parameter();
		n.setValue(getMessageBack(in.getValue()));
		return n;
	}
}
