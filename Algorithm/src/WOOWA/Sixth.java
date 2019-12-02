package WOOWA;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sixth {
	public static void main(String[] args) throws IOException {
		String[][] forms = {
				{"jm@email.com", "¡¶¿Ãø•"},
				{"jason@email.com", "¡¶¿ÃΩº"}
		};
		Solution.solution(forms);
		
	}
	
}


	class Solution {
	    public static void solution(String[][] forms) {
	        String[] answer = {}; //±Ê¿Ã ¡§«ÿ¡‡æﬂ«‘
	        //int cnt = 0;
	        List nick = new ArrayList();
	        List duple = new ArrayList();
	        List compare = new ArrayList();
	        List mail = new ArrayList();
	       
	        int ans =0;
	        
	        for(int i=0;i<forms.length;i++){
	            nick.add(forms[i][1]);
	            //System.out.println(forms[i][1]);
	        }
	        
	        while(!nick.isEmpty()){
	            int s = 0; //idx
	            int[] idx = {}; // ±Ê¿Ã ¡§«ÿ¡‡æﬂ«‘
	            int size = nick.size();
	            int cnt = 0;
	            if(nick.size()==1) break;
	            String str = nick.get(0).toString();
	            //System.out.println(str);
	            for(int j=0;j<str.length()-1;j++){
	                String cp;
	                if(j==str.length()-2) cp = str.substring(j); 
	                else cp = str.substring(j,j+2);
	                for(int i=0;i<size;i++){
	                    compare.add(nick.get(i).toString());
	                    if(compare.contains(cp)){
	                        cnt++;
	                        duple.add(nick.get(i).toString());
	                        //nick.remove(i);
	                        idx[s] = i;
	                        s++;
	                    }
	                    compare.clear();
	                }
	               // if(cnt>1) break;
	            }
	            if(duple.size()==1) duple.clear();
	            else{
	                for(int m=0;m<idx.length;m++){
	                    //mail.add(forms[0][m]);
	                    answer[ans] = forms[0][m];
	                    ans++;
	                }
	            }
	            for(int k=0;k<idx.length;k++){
	                nick.remove(idx[k]);
	            }
	        }
	        //Collections.sort(mail);
	        Arrays.sort(answer);
	        //return answer;
	       // return mail;
	        for(int i=0;i<answer.length;i++) {
	        	System.out.print(answer[i]+" ");
	        }
	    }
	}


//