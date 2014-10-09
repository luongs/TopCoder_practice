/**
** Given an input string, reverse the string word by word.
*
*For example,
*Given s = "the sky is blue",
*return "blue is sky the".
*A word is: A sequence of non-space characters, with no leading or trailing spaces 
*and no multiple spaces
**
**/

public String reverseWords(String s) {
        // Remove leading and trailing white spaces
        s = s.trim();
        // Remove extra spaces
        String[] strArr = s.split("\\s+");
		StringBuffer strBuf = new StringBuffer();
		int ind = strArr.length-1;
		char space = ' ';
		if (s.length()<=1 && !s.equals(" "))
		    return s;
		while (ind>=0){
			strBuf.append(strArr[ind--]);
			if (ind >=0)
			    strBuf.append(space);
		}
		// Remove any added spaces at start or end
		String res = strBuf.toString().trim();
		return strBuf.toString();
    }