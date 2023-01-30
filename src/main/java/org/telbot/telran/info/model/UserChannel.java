package org.telbot.telran.info.model;

import javax.persistence.*;

/**
 * This is an entity created for the entities user and channel to determine which channels the user ia subscribed to
 *
 * @author Munhal Mammdov
 * @version 1.0
 */

@Entity
@Table(name = "user_channel")
public class UserChannel {
    /**
     * Unique identifier for the user_channel,which generated automatically
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    /**
     * This is our id for user
     */
    @Column(name = "user_id")
    private long userId;
    /**
     * This is our id for channel
     */
    @Column(name = "channel_id")
    private long channelId;

    public UserChannel() {
        //
    }

    public UserChannel(long userId, long channelId) {
        this.userId = userId;
        this.channelId = channelId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "UserChannel{" +
                "id=" + id +
                ", userId=" + userId +
                ", channelId=" + channelId +
                '}';
    }
}
