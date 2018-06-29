import java.util.Stack;

public class register {
	private Stack<Integer> registerStack=new Stack<Integer>();
	
	/* Registers rax, rbx, rcx, rdx, rsi, rdi, and
	 * r8~r15 are general registers */
	public register(int low,int high)
	{
		int a;
		
		/* set integer registers (available), r0~r10 */
		for (a=high; a>=low; a--)
			registerStack.push(a);		
	}
	
	public int get()
	{
		return registerStack.pop();
	}
	
	public void set(String s)
	{
		registerStack.push(Integer.parseInt(s.substring(1)));
	}
}
