package behavioral.iterator;


public class IteratorMain {
	
    public IteratorMain() {
    	
        ChannelCollectionInterface channels   = populateChannels();
        
        
        ChannelIteratorInterface baseIterator = channels.iterator(ChannelTypeEnum.ALL);
        System.out.println("***** All available channels *****");
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("***** end *****");
        
        
        // Channel Type Iterator
        System.out.println("***** All spanish channels *****");
        ChannelIteratorInterface spanishIterator = channels.iterator(ChannelTypeEnum.SPANISH);
        while (spanishIterator.hasNext()) {
            Channel s = spanishIterator.next();
            System.out.println(s.toString());
        }
        
        System.out.println("***** All english channels *****");
        ChannelIteratorInterface englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel e = englishIterator.next();
            System.out.println(e.toString());
        }

        System.out.println("***** All french channels *****");
        ChannelIteratorInterface frenchIterator = channels.iterator(ChannelTypeEnum.FRENCH);
        while (frenchIterator.hasNext()) {
            Channel f = frenchIterator.next();
            System.out.println(f.toString());
        }
    }

    private static ChannelCollectionInterface populateChannels() {
    	
        ChannelCollectionInterface channels = new ChannelCollection();
        channels.addChannel(new Channel(198.50, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(199.50, ChannelTypeEnum.SPANISH));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.SPANISH));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.SPANISH));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }   
}
