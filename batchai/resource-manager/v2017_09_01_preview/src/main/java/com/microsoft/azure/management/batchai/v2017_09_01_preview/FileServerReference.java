/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides required information, for the service to be able to mount Azure
 * FileShare on the cluster nodes.
 */
public class FileServerReference {
    /**
     * Reference to the file server resource.
     */
    @JsonProperty(value = "fileServer", required = true)
    private ResourceId fileServer;

    /**
     * Specifies the source directory in File Server that needs to be mounted.
     * If this property is not specified, the entire File Server will be
     * mounted.
     */
    @JsonProperty(value = "sourceDirectory")
    private String sourceDirectory;

    /**
     * Specifies the relative path on the compute node where the File Server
     * will be mounted.
     * Note that all file shares will be mounted under $AZ_BATCHAI_MOUNT_ROOT
     * location.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Specifies the mount options for File Server.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get the fileServer value.
     *
     * @return the fileServer value
     */
    public ResourceId fileServer() {
        return this.fileServer;
    }

    /**
     * Set the fileServer value.
     *
     * @param fileServer the fileServer value to set
     * @return the FileServerReference object itself.
     */
    public FileServerReference withFileServer(ResourceId fileServer) {
        this.fileServer = fileServer;
        return this;
    }

    /**
     * Get if this property is not specified, the entire File Server will be mounted.
     *
     * @return the sourceDirectory value
     */
    public String sourceDirectory() {
        return this.sourceDirectory;
    }

    /**
     * Set if this property is not specified, the entire File Server will be mounted.
     *
     * @param sourceDirectory the sourceDirectory value to set
     * @return the FileServerReference object itself.
     */
    public FileServerReference withSourceDirectory(String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
        return this;
    }

    /**
     * Get note that all file shares will be mounted under $AZ_BATCHAI_MOUNT_ROOT location.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set note that all file shares will be mounted under $AZ_BATCHAI_MOUNT_ROOT location.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the FileServerReference object itself.
     */
    public FileServerReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get the mountOptions value.
     *
     * @return the mountOptions value
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions value.
     *
     * @param mountOptions the mountOptions value to set
     * @return the FileServerReference object itself.
     */
    public FileServerReference withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

}
