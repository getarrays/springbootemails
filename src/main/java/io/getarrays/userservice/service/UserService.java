package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.User;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 6/24/2023
 */

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}