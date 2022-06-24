public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean checkBST(TreeNode root, long min, long max){
        if(root == null) return true;
        
        if(root.val >= max || root.val <= min) return false;
        
        return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
        
    }