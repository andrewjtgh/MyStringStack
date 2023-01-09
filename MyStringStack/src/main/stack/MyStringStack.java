package stack;

public class MyStringStack {

	public String[] stack = new String[10];

	public boolean isEmpty() {
		boolean result = true;
		for (String i : stack) {
			if (i != null) {
				result = false;
				break;
			}
		}
		return result;
	}

	public void push(String s1) {
		int i = 0;
		int insert = 0;
		while (i < stack.length) {
			if (stack[i] == null) {
				insert += 1;
				break;
			}
			i++;
		}
		stack[insert - 1] = s1;
	}

	public String pop() {
		int i = 0;
		int pop = 0;
		String result = null;
		while (stack[i] != null) {
			pop = i;
			i++;
			result = stack[pop];
		}
		stack[pop] = null;
		if (i == 0)
			throw new IndexOutOfBoundsException("You popped an empty stack");
		return result;
	}
}