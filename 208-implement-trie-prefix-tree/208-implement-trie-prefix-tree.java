class TrieNode {

    // R children to node children
    private TrieNode[] children;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return children[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return children[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        children[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
       TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char currChar = word.charAt(i);
            if(!node.containsKey(currChar)){
                node.put(currChar, new TrieNode());  
            }
            node = node.get(currChar);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char currChar: word.toCharArray()){
            if(!node.containsKey(currChar)){
                return false;
            }
            node = node.get(currChar);
        }
        return node.isEnd();
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char currChar: prefix.toCharArray()){
            if(!node.containsKey(currChar)){
                return false;
            }
            node = node.get(currChar);
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

//"window"
/*
          w
         / \ \
        o   a  i
*/