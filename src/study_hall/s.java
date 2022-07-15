package study_hall;

import org.w3c.dom.Node;

//public class topViewOfTree {
//        static void topView(Node root) {
//
//                if (root != null) {
//
//                        topView(root.left, true);
//
//                        System.out.print(root.data + " ");
//
//                        topView(root.right, false);
//
//                }
//
//        }
//
//        public static void topView(Node node, boolean goLeft) {
//
//                if (node != null) {
//                        if (goLeft) {
//                                topView(node.left, goLeft);
//                                System.out.print(node.data + " ");
//                        } else {
//                                System.out.print(node.data + " ");
//                                topView(node.right, goLeft);
//                        }
//                }
//
//        }
//}