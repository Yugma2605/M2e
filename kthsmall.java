class Solution {
	int count=1;
	int x;
	public int kthSmallest(TreeNode root, int k) {
		 if(root==null){
			return 0;
		}
		kthSmallest(root.left,k);
		if(count==k){
			x=root.val;
		}
		count++;
		kthSmallest(root.right,k);
		return x;
	}
}