package behavioral.iterator;

import java.util.List;

public class ChannelIterator implements ChannelIteratorInterface {
	
	private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIterator(ChannelTypeEnum ty, List<Channel> channelsList) {
        this.type = ty;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
    	
        while (position < channels.size()) {
        	
            Channel c = channels.get(position);
            
            if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } 
            else {
            	position++;
            	
            }
        }
        
		return false;
        
    }

    @Override
    public Channel next() 
    {
        Channel c = channels.get(position);
        position++;
        return c;
    }
}
