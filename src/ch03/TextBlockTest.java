package ch03;

public class TextBlockTest {

	public static void main(String[] args) {
		
		/*
		 * 문자열을 """ """ 사이에 이어서 만들 수 있음
		 * html, json 문자열을 만드는데 유용하게 사용할 수 있음 
		 */
		
		/*
		 * The Java feature 'Text Blocks' is only available with source level 15 and above
		 * 해당 project 우클릭 ==> Properties ==> Java Compiler ==> 
		 * Use compliance from execution environment...를 unCheck ==>
		 * Use default compliance settings 를 unCheck ==>
		 * Enable preview features for java xx 를 Check ==> Apply ==> Apply and Close 
		 */
		
		/*
		String textBlock = """
			hi,
			hello,
			how r u""";
		
		System.out.println(textBlock);	
		System.out.println(getBlockOfHtml();	
		*/
		
	}
	/*
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>""";
	}
	*/
}
