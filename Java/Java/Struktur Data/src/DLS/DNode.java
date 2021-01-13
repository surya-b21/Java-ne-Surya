package DLS;

public class DNode<T>
    {
        public T nodeValue; // data value of the node
        public DNode<T> prev; // previous node in the list
        public DNode<T> next; // next node in the list
        // default constructor; creates an object with
        // the value set to null and whose references
        // point to the node itself
        public DNode()
        {
            nodeValue = null;
            // the next node is the current node
            next = this;
            // the previous node is the current node
            prev = this;
        }
        // creates object whose value is item and
        // whose references point to the node itself
        public DNode(T item)
        {
            nodeValue = item;
            // the next node is the current node
            next = this;
            // the previous node is the current node
            prev = this;
    }
}