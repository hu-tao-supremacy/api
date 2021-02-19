/* eslint-disable */
export const protobufPackage = "hts.common";

export interface Result {
  isOk: boolean;
  description: string;
}

export interface User {
  id: number;
  firstName: string;
  lastName: string;
}

export interface Event {
  id: number;
  organizationId: number;
  eventLocationId: number;
  description: string;
  name: string;
  coverImage: string;
  coverImageHash: string;
  posterImage: string;
  posterImageHash: string;
  contact: string;
}

export interface UserEvent {
  id: number;
  userId: number;
  eventId: number;
}

export interface EventFeedback {
  id: number;
  eventId: number;
  feedback: string;
}

export const HTS_COMMON_PACKAGE_NAME = "hts.common";
