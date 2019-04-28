package behavioral.iterator;


public interface ChannelCollectionInterface {
	
    public void addChannel(Channel c);
	
    public void removeChannel(Channel c);
	
    public ChannelIteratorInterface iterator(ChannelTypeEnum type);

}
