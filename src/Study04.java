import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Study04 {

	public static void main(String[] args) {

			List<Map> list = new ArrayList<Map>();
			Map<String, Object> map = new HashMap<String, Object>();
			map = new HashMap<String, Object>();
			map.put("no", 1);
			map.put("name", "홍길동");
			list.add(map);
					
			map = new HashMap<String, Object>();
			map.put("no", 2);
			map.put("name", "유관순");
			list.add(map);
			
			for(int i =0; i < list.size(); i++) {
				Map m = list.get(i);
				Iterator it = m.keySet().iterator();
				
				while(it.hasNext()) {
					System.out.println(m.get(it.next()));
				}
				
//				System.out.println(m.get("no"));
//				System.out.println(m.get("name"));
			}
					
	}

}
