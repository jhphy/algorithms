class SerializeandDeserializeBinaryTree:

    def serialize(self, root):
        self.res = []
        def preorder(node):
            if not node:
                self.res.append('#')
            else:
                self.res.append(str(node.val))
                preorder(node.left)
                preorder(node.right)
        preorder(root)
        return '.'.join(self.res)
            
        

    def deserialize(self, data):
        def helper():
            val = next(vals)
            if val == '#':
                return None
            node = TreeNode(int(val))
            node.left = helper()
            node.right = helper()
            return node
        
        vals = iter(data.split('.'))

    def serializebfs(self, root):
        if not root:
            return ""
        q = collections.deque()
        res = []
        q.append(root)
        while q:
            cur = q.popleft()
            if not cur:
                res.append('#')
            else:
                res.append(str(cur.val))
                q.append(cur.left)
                q.append(cur.right)
        return '.'.join(res)
        

    def deserializebfs(self, data):
        if not data:
            return []
        q = collections.deque()
        vals = iter(data.split('.'))
        root = TreeNode(next(vals))
        q.append(root)
        
        while q:
            node = q.popleft()
            l = next(vals)
            if l == '#':
                node.left = None
            else:
                node.left = TreeNode(int(l))
                q.append(node.left)
            r = next(vals)
            if r == '#':
                node.right = None
            else:
                node.right = TreeNode(int(r))
                q.append(node.right)
        return root

 class SerializeandDeserializeBST:

    def serializePostorder(self, root):
        def postorder(node):
            if not node:
                return
            postorder(node.left)
            postorder(node.right)
            res.append(str(node.val))
        res = []
        postorder(root)
        return '.'.join(res)
        
        

    def deserializePostorder(self, data):
        def dpost(lower = float('-inf'), upper = float('inf')):
            if not data or data[-1] < lower or data[-1] > upper:
                return None
            val = data.pop()
            root = TreeNode(val)
            root.right = dpost(val, upper)
            root.left = dpost(lower, val)
            return root
        
        data = [int(x) for x in data.split('.') if x]    
        return dpost()