package binaryTree;

public class initialLesson {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        // 1. Khởi tạo Node gốc chứa số 10
        TreeNode root = new TreeNode(10);

        // 2. VIẾT CODE CỦA BẠN: Nối số 20 vào bên TRÁI của số 10
        root.left = new TreeNode(20);

        // 3. VIẾT CODE CỦA BẠN: Nối số 30 vào bên PHẢI của số 10
        root.right = new TreeNode(30);

        // 4. VIẾT CODE CỦA BẠN: Nối số 40 vào bên TRÁI của số 20
        // Gợi ý: Đi từ root -> sang trái (để gặp 20) -> rồi lại sang trái phát nữa
        root.left.left = new TreeNode(40);


        // --- Đoạn code dưới đây dùng để kiểm tra xem bạn nối đúng chưa ---
        System.out.println("Gốc cây: " + root.val); // Phải ra 10
        if (root.left != null) System.out.println("Con trái của gốc: " + root.left.val); // Phải ra 20
        if (root.right != null) System.out.println("Con phải của gốc: " + root.right.val); // Phải ra 30
        if (root.left != null && root.left.left != null) {
            System.out.println("Con trái của 20: " + root.left.left.val); // Phải ra 40
        }
    }
}
