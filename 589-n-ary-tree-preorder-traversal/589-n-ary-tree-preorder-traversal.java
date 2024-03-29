/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
            return result;
        
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr=stack.pop();
            result.add(curr.val);
            
            for(int i=curr.children.size()-1;i>=0;i--){
                stack.push(curr.children.get(i));
            }
        }
        return result;
    }

}