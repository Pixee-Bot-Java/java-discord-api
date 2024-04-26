package com.javadiscord.jdi.internal.api.guild;

import com.javadiscord.jdi.internal.api.DiscordRequest;
import com.javadiscord.jdi.internal.api.DiscordRequestBuilder;

public record DeleteGuildRequest(long guildId) implements DiscordRequest {

    @Override
    public DiscordRequestBuilder create() {
        return new DiscordRequestBuilder().delete().path("/guilds/%s".formatted(guildId));
    }
}