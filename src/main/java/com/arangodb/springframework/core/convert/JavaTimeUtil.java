/*
 * DISCLAIMER
 *
 * Copyright 2018 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.springframework.core.convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Mark Vollmary
 *
 */
public class JavaTimeUtil {

	private JavaTimeUtil() {
		super();
	}

	public static String format(final Instant source) {
		return DateTimeFormatter.ISO_INSTANT.format(source);
	}

	public static String format(final LocalDate source) {
		return DateTimeFormatter.ISO_LOCAL_DATE.format(source);
	}

	public static String format(final OffsetDateTime source) {
		return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(source);
	}

	public static String format(final LocalDateTime source) {
		return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(source);
	}

	public static String format(final ZonedDateTime source) {
		return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(source);
	}

	public static Instant parseInstant(final CharSequence source) {
		return Instant.parse(source);
	}

	public static LocalDate parseLocalDate(final CharSequence source) {
		return LocalDate.parse(source);
	}

	public static LocalDateTime parseLocalDateTime(final CharSequence source) {
		return LocalDateTime.parse(source);
	}

	public static OffsetDateTime parseOffsetDateTime(final CharSequence source) {
		return OffsetDateTime.parse(source);
	}

	public static ZonedDateTime parseZonedDateTime(final CharSequence source) {
		return ZonedDateTime.parse(source);
	}
}
