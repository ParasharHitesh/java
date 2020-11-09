package Practice;

public class broakenLinks {

	public static void main(String[] args) {
		
		List <WebElement> link= driver.findElements(By.tagname("a"));
		
		for(int i=0;i<link.size;i++) {
			WebElement element=link.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			
			HttpURLConnection http=(HttpURLConnection) link.openConnection();
			http.connect();
			int res=http.getResponseCode();
			if(res=>400) {
				System.out.println("Broaken Link");
			}
			else {
				System.out.println("Valid Link");
			}
			
		}

	}

}
