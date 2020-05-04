namespace Lists
{
    public interface IList<E>
    {
        int Length();
        void Add(E item);
        void Remove(E item);
        void RemoveAll();
        E[] ToArray();
        bool Exists(E item);
        int IndexOf(E item);
        E ItemAt(int index);
    }
}