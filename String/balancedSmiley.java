public static String isBalanced(String str){
		int countBraces = 0;
		boolean colon = false;
		boolean balanced = false;
		boolean prev = false;
		Stack<Character> s = new Stack<Character>();
		
		

		for(int i=0;i<str.length();i++){
			
			if(colon)
				prev = true;
			if(str.charAt(i)==':')
				colon=true;
			else if(str.charAt(i)=='('&&colon==false){
				s.push(str.charAt(i));
			}
			else if(str.charAt(i)==')'&&colon==false){
				if(s.empty()){
					if(balanced)
						balanced = false;
					else
						return "NO";
				}
				else{
					char c = s.peek();
					if(c=='(')
						c = s.pop();
					else if(balanced)
						balanced = false;
					else
						return "NO";
				}
			}
			else if(str.charAt(i)==')'){
				colon=false;
				if(!s.empty()){
					 char c = s.peek();
					if(c=='('){
						balanced = true;
						c = s.pop();
					}
				}        
			}
			else if(str.charAt(i)=='('){
				s.push(str.charAt(i));
				colon=false;
				countBraces++;
			}
			if(prev){
				prev = false;
				colon = false;
			}
		}

		if(s.empty())
			return "YES";
		else{
			if(s.size()==countBraces)
				return "YES";
			else
				return "NO";
		}
	}
