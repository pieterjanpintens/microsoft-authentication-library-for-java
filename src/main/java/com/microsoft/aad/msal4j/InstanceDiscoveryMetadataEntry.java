// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.*;

@Accessors(fluent = true)
@Getter(AccessLevel.PACKAGE)
@Builder
class InstanceDiscoveryMetadataEntry {

    @JsonProperty("preferred_network")
    String preferredNetwork;

    @JsonProperty("preferred_cache")
    String preferredCache;

    @JsonProperty("aliases")
    Set<String> aliases;
}
