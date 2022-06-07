public interface Chain {
	public void setNextChain(Chain nextChain);
	public void repair(Operations request);
}