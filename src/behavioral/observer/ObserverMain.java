package behavioral.observer;


public class ObserverMain {
	
    public ObserverMain() {
    	
            //create subject
            MyBlog blog = new MyBlog();

            //create observers
            Observer subscriber1 = new MyBlogSubscriber("Obj1");
            Observer subscriber2 = new MyBlogSubscriber("Obj2");
            Observer subscriber3 = new MyBlogSubscriber("Obj3");

            //register observers to the subject
            blog.register(subscriber1);
            blog.register(subscriber2);
            blog.register(subscriber3);

            //attach observer to subject
            subscriber1.setSubject(blog);
            subscriber2.setSubject(blog);
            subscriber3.setSubject(blog);

            //check if any update is available
            subscriber1.update();

            //now send message to subject
            blog.postMessage("Steak for dinner !");
            
            subscriber1.update();

            //now send message to subject
            blog.postMessage("Here we go!!");
            
    }    
}
