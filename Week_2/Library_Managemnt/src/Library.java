import java.util.List;
public class Library {
    public static Book linearsearch(List<Book> books,String target){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(target)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarysearch(List<Book> books,String target){
        int left=0,right=books.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            Book midbook=books.get(mid);
            int cmp=midbook.getTitle().compareToIgnoreCase(target);
            if(cmp==0) return midbook;
            else if(cmp<0) left=mid+1;
            else right=mid-1;

        }
        return null;
    }
}
