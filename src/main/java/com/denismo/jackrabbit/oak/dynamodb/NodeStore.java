package com.denismo.jackrabbit.oak.dynamodb;

import org.apache.jackrabbit.oak.api.Blob;
import org.apache.jackrabbit.oak.api.CommitFailedException;
import org.apache.jackrabbit.oak.spi.commit.CommitHook;
import org.apache.jackrabbit.oak.spi.commit.CommitInfo;
import org.apache.jackrabbit.oak.spi.state.NodeBuilder;
import org.apache.jackrabbit.oak.spi.state.NodeState;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: Denis Mikhalkin
 * Date: 12/11/2014
 * Time: 11:00 PM
 */
public class NodeStore implements org.apache.jackrabbit.oak.spi.state.NodeStore {
    @Nonnull
    @Override
    public NodeState getRoot() {
        return null;
    }

    @Nonnull
    @Override
    public NodeState merge(@Nonnull NodeBuilder nodeBuilder, @Nonnull CommitHook commitHook, @Nonnull CommitInfo commitInfo) throws CommitFailedException {
        return null;
    }

    @Nonnull
    @Override
    public NodeState rebase(@Nonnull NodeBuilder nodeBuilder) {
        return null;
    }

    @Override
    public NodeState reset(@Nonnull NodeBuilder nodeBuilder) {
        return null;
    }

    @Nonnull
    @Override
    public Blob createBlob(InputStream inputStream) throws IOException {
        return null;
    }

    @Override
    public Blob getBlob(@Nonnull String s) {
        return null;
    }

    @Nonnull
    @Override
    public String checkpoint(long l) {
        return null;
    }

    @Override
    public NodeState retrieve(@Nonnull String s) {
        return null;
    }

    @Override
    public boolean release(@Nonnull String s) {
        return false;
    }
}
