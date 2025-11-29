package com.example.Tries;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    int count = 0;
}

public class UniquePrefix {

    private TrieNode root = new TrieNode();
//    public UniquePrefix() {
//        root = new TrieNode();
//    }

    // Insert word into Trie
    public void insert(String word) {
        TrieNode curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
            curr.count++; // increment prefix count
        }
    }

    // Find the shortest unique prefix of a word
    public String getUniquePrefix(String word) {
        TrieNode curr = root;
        StringBuilder prefix = new StringBuilder();

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            curr = curr.children[idx];
            prefix.append(ch);

            // If count = 1 → unique prefix
            if (curr.count == 1) {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        UniquePrefix trie = new UniquePrefix();

        // Insert all words
        for (String w : words) {
            trie.insert(w);
        }

        // Get unique prefixes
        for (String w : words) {
            System.out.println(w + " → " + trie.getUniquePrefix(w));
        }
    }
}

