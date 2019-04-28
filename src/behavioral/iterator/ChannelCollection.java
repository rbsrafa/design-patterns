package behavioral.iterator;


import java.util.ArrayList;
import java.util.List;

public class ChannelCollection implements ChannelCollectionInterface {
	
    private List<Channel> channelsList;

    public ChannelCollection() {
    	
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIteratorInterface iterator(ChannelTypeEnum type) {
        return new ChannelIterator(type, this.channelsList);
    }

}
