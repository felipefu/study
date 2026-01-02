import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        Stack<Action> stack = new Stack<>();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) { // Append
                String w = st.nextToken();
                sb.append(w);
                stack.push(new Action(1, w));
            } else if (type == 2) { // Delete
                int k = Integer.parseInt(st.nextToken());
                String deleted = sb.substring(sb.length() - k);
                sb.delete(sb.length() - k, sb.length());
                stack.push(new Action(2, deleted));
            } else if (type == 3) { // Print
                int k = Integer.parseInt(st.nextToken());
                bw.write(sb.charAt(k - 1));
                bw.newLine();
            } else if (type == 4) { // Undo
                Action lastAction = stack.pop();
                if (lastAction.type == 1) {
                    // Undo append -> delete
                    sb.delete(sb.length() - lastAction.value.length(), sb.length());
                } else {
                    // Undo delete -> append
                    sb.append(lastAction.value);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static class Action {
        int type;
        String value;

        public Action(int type, String value) {
            this.type = type;
            this.value = value;
        }
    }
}