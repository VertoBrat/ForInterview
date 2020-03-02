package ru.photorex.server.changelog;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import ru.photorex.server.model.Author;
import ru.photorex.server.model.Book;
import ru.photorex.server.model.Comment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@ChangeLog(order = "001")
public class InitMongoDbWithCollections {

    private List<Comment> comments = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    @ChangeSet(order = "001", id = "dropDataBase", author = "photorex", runAlways = true)
    public void dropDb(MongoDatabase mongoDatabase) {
        mongoDatabase.drop();
    }

    @ChangeSet(order = "002", id = "initCommentsCollection", author = "photorex", runAlways = true)
    public void initComments(MongoTemplate template) {
        Comment comment1 = template.save(new Comment("Text#1", null, LocalDateTime.now()));
        Comment comment2 = template.save(new Comment("Text#2", null, LocalDateTime.now()));
        Comment comment3 = template.save(new Comment("Text#3", null, LocalDateTime.now()));
        Comment comment4 = template.save(new Comment("Text#4", null, LocalDateTime.now()));
        fillCommentList(comment1, comment2, comment3, comment4);
    }

    @ChangeSet(order = "003", id = "initBooksCollection", author = "photorex", runAlways = true)
    public void initBooks(MongoTemplate template) {
        String contentOne = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String contentTwo = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        String contentThree = "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.";
        Book book1 = template.save(new Book("Effective_Java_3rd",contentOne, Set.of("Story", "IT"), Set.of(new Author("Joshua", "Bloh")), List.of(comments.get(0))));
        Book book2 = template.save(new Book("Civilization of status",contentTwo, Set.of("Roman"), Set.of(new Author("Robert", "Shekli")), List.of(comments.get(1), comments.get(2))));
        Book book3 = template.save(new Book("Missing Certificate",contentThree, Set.of("Comedy"), Set.of(new Author("Nikolay", "Gogol"), new Author("NoFirstName", "NoLastName")), List.of(comments.get(3))));
        Book book4 = template.save(new Book("Some Book 4", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book5 = template.save(new Book("Some Book 5", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book6 = template.save(new Book("Some Book 6", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book7 = template.save(new Book("Some Book 7", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book8 = template.save(new Book("Some Book 8", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book9 = template.save(new Book("Some Book 9", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book10 = template.save(new Book("Some Book 10", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book11 = template.save(new Book("Some Book 11", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book12 = template.save(new Book("Some Book 12", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book13 = template.save(new Book("Some Book 13", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book14 = template.save(new Book("Some Book 14", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book15 = template.save(new Book("Some Book 15", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book16 = template.save(new Book("Some Book 16", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book17 = template.save(new Book("Some Book 17", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book18 = template.save(new Book("Some Book 18", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book19 = template.save(new Book("Some Book 19", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book20 = template.save(new Book("Some Book 20", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book21 = template.save(new Book("Some Book 21", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book22 = template.save(new Book("Some Book 22", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book23 = template.save(new Book("Some Book 23", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book24 = template.save(new Book("Some Book 24", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));
        Book book25 = template.save(new Book("Some Book 25", null, Set.of("Some Genre"), Set.of(new Author("Some firstName", "Some lastName"))));

        fillBookList(book1, book2, book3, book4, book5,
                book6, book7, book8, book9, book10,
                book11, book12, book13, book14, book15,
                book16, book17, book18, book19, book20,
                book21, book22, book23, book24, book25);
    }

    @ChangeSet(order = "004", id = "fillCommentsWithBook", author = "photorex", runAlways = true)
    public void fillCommentsWithBooks(MongoTemplate template) {
        template.updateFirst(Query.query(where("id").is(comments.get(0).getId())), new Update().set("book", books.get(0)),Comment.class);
        template.updateFirst(Query.query(where("id").is(comments.get(1).getId())), new Update().set("book", books.get(1)),Comment.class);
        template.updateFirst(Query.query(where("id").is(comments.get(2).getId())), new Update().set("book", books.get(1)),Comment.class);
        template.updateFirst(Query.query(where("id").is(comments.get(3).getId())), new Update().set("book", books.get(2)),Comment.class);
    }

    private void fillCommentList(Comment...comments) {
        this.comments.addAll(Arrays.asList(comments));
    }

    private void fillBookList(Book...books) {
        this.books.addAll(Arrays.asList(books));
    }
}
