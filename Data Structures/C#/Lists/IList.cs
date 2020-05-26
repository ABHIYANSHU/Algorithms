using System.Collections;

namespace Lists
{
    public interface IList<E> : IEnumerable
    {
        int Length();
        void Add(E item);
        void Remove(E item);
        void RemoveAll();
        E[] ToArray();
        bool Exists(E item);
        int IndexOf(E item);
        E ItemAt(int index);
        IList<E> Reverse();
    }
}